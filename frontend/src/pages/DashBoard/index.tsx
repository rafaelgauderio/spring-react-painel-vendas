import BarChart from "components/BarChart";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";
import SalesTable from "components/SalesTable";

const DashBoard = () => {

    return (
        <div>
            <>
                <NavBar />
                <div className="container">
                    <h1 className="text-primary py-4">Painel de Vendas</h1>
                    <div className="row px-4">
                        <div className="col-sm-6">
                            <h4 className="text-center text-info">Desempenho visitas (%)</h4>
                            <BarChart></BarChart>
                        </div>
                        <div className="col-sm-6">
                            <h4 className="text-center text-info">Total das vendas (%)</h4>
                            <DonutChart></DonutChart>
                        </div>
                    </div>
                    <div className="py-3">
                        <h2 className="text-primary">Total das Vendas</h2>
                    </div>
                    <SalesTable />
                </div>
                <Footer />
            </>
        </div>
    );
};

export default DashBoard;