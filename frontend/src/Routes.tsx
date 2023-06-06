import Home from "pages/Home";
import DashBoard from "pages/DashBoard";
import { BrowserRouter, Route, Routes } from "react-router-dom";

// componente que define as rotas de navegação do sistema
const Rotas = () => {
    
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" Component={Home} />              
                <Route path="/dashboard" Component={DashBoard } />                 
            </Routes>
        </BrowserRouter>

    );
}

export default Rotas;
