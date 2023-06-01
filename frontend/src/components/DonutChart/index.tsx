import Chart from 'react-apexcharts';

const DonutChart = () => {

    const dadosMockados = {
        series: [457138, 429928, 304867, 180426, 253088],
        labels: ['Rafael', 'Diego', 'Larissa', 'Claudia', 'Olga']
    }

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart
            options={{ ...options, labels: dadosMockados.labels }}
            series={dadosMockados.series}
            type="donut"
            height={250}
        >
        </Chart>


    );
};

export default DonutChart;