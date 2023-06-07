import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { ClosedDealsSuccessFee } from 'types/sales';
import { numberFormat } from 'utils/numberFormat';
import { BASE_URL } from 'utils/request';

type SeriesData = {
    name: string;
    data: number [];
}

type ChartData = {
    labels : {
        categories: string[];
    }
    series: SeriesData[]

}

function BarChart() {

    const [chartData, setChartData] = useState<ChartData>({
        labels: {
            categories: []
        }, 
        series: [
            {
                name: "",
                data: [],
            }
        ]
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/sales/successFeeBySeller`)
            .then(respostaRequisicao => {
                const data = respostaRequisicao.data as ClosedDealsSuccessFee [];
                const rotulos = data.map(x => x.sellerName);
                const valores = data.map(x => numberFormat((x.sumClosedDeals/x.sumVisitedClients)*100,2));

                setChartData({
                    labels: {
                        categories: rotulos
                    },
                    series: [
                        {
                            name: "% Vendas fechadas por visita",
                            data: valores
                        }
                    ]
                });
            });
    },[]);



    const options = {
        plotOptions: {
            bar: {
                horizontal: true,                
                borderRadius: 4,
                dataLabels: {
                    position: 'center',
                  },
            }  
        },
        dataLabels: {
            enabled: true,           
            style: {
              fontSize: '14px',
              colors: ['#383837'],            
            }
        }

    };

    /*
    const dadosMockados = {
        labels: {
            categories: ['Rafael', 'Diego', 'Larissa', 'Claudia', 'Olga']

        },
        series: [
            {
                name: "% Vendas fechadas por visita",
                data: [23.4, 65.3, 45.4, 80.7, 35.9],
            },

        ]
    };
    */

    return (
        <Chart
            options={{ ...options, xaxis: chartData.labels }}
            series={chartData.series}
            type="bar"
            height={250}
        >
        </Chart>
    );
};

export default BarChart;