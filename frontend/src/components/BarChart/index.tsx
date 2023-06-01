import Chart from 'react-apexcharts';

function BarChart() {

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

    return (
        <Chart
            options={{ ...options, xaxis: dadosMockados.labels }}
            series={dadosMockados.series}
            type="bar"
            height={250}
        >
        </Chart>
    );
};

export default BarChart;