import NavBar from 'components/NavBar';
import Footer from 'components/Footer';
import React from 'react';
import SalesTable from 'components/SalesTable';

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary my-2">Painel de Vendas</h1>
        <SalesTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
