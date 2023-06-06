import axios from 'axios';
import Chart from 'react-apexcharts';
import { BASE_URL } from 'utils/request';

export type ChartData = {
    labels: string [];
    series: number [];
};

const DonutChart = () => {

    // iniciando os dados com lista vazia
    let chartData : ChartData = { labels: [], series: []};

    axios.get(BASE_URL + '/sales/totalSalesBySeller')
        .then( (respostaRequisicao) => {
            console.log(respostaRequisicao.data);
        })

    /*
    const dadosMockados = {
        series: [457138, 429928, 304867, 180426, 253088],
        labels: ['Rafael', 'Diego', 'Larissa', 'Claudia', 'Olga']
    }
    */

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
        >
        </Chart>


    );
};

export default DonutChart;