import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { SaleSum } from 'types/sales';
import { BASE_URL } from 'utils/request';

export type ChartData = {
    labels: string[];
    series: number[];
};

const DonutChart = () => {

    // nome do estado e funcao que atualiza o estado desse estado
    const [chartData, setChartData] = useState<ChartData>({ labels: [], series: [] });

    // dois argumentos (função a executar, lista de objetos que o useEffect vai monitorar)
    useEffect(() => {
        // iniciando os dados com lista vazia
        // em uma chamada sicrona a API renderiza a tela muito rápido e acaba carregando a lista vazia.
        // tem que ser um requisição assincrona para aguardar responder a requisição para renderizar os dados do gráfico
        // ciclo de vida de renderização gráfica de um componente react
        //let chartData : ChartData = { labels: [], series: []};

        //axios.get(BASE_URL + '/sales/totalSalesBySeller')
        axios.get(`${BASE_URL}/sales/totalSalesBySeller`)
            .then((respostaRequisicao) => {
                // tipando dados dos gráfico
                const salesData = respostaRequisicao.data as SaleSum[];
                const rotulos = salesData.map(x => x.sellerName);
                const valores = salesData.map(y => y.sumSales);
                setChartData({ labels: rotulos, series: valores });
                //console.log(chartData);
            });
    }, []); 

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart
            options={{ ...options, labels: chartData.labels }}
            series={chartData.series}
            type="donut"
            height={250}
         />        
    );
};

export default DonutChart;