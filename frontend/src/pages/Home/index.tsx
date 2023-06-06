import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Home = () => {

    return (
        <>
            <NavBar></NavBar>
            <div>
                <div className="container my-5">
                    <div className="jumbotron">
                        <h1 className="display-5">Painel de Vendas</h1>
                        <p className="lead">Análise de Vendas por vendedor</p>
                        <p className="lead">Total de vendas realizas por valor e taxa de vendas fechadas por visita. </p>
                        <hr />
                        <p>Esta API exibe uma dashboard em um frontEnd desenvolvido com React e typescript. E o backend com java e Spring-Boot.</p>
                        <Link className="btn btn-primary btn-lg" to="/dashboard">
                            Acessar Painel de Vendas
                        </Link>
                    </div>
                </div>
            </div>
            <Footer></Footer>
        </>
    );
};

export default Home;