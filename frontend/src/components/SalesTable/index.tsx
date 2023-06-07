import axios from "axios";
import { useEffect, useState } from "react";
import { SalePage } from "types/sales";
import { formatLocalDate } from "utils/dateFormat";
import { BASE_URL } from "utils/request";

const SalesTable = () => {

    const [pagina, setPagina] = useState<SalePage>({
        totalElements: 0,
        totalPages: 0,
        last: true,
        number: 0,
        first: true,
        empty: false,
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/sales?page=0&size=200&sort=date,asc`)
            .then((requestResponse) => {
                setPagina(requestResponse.data);
            });
    }, []);


    return (
        <div className="table-responsive">
            <table className="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>Data</th>
                        <th>Consultor</th>
                        <th>Visitas realizadas</th>
                        <th>Vendas fechadas</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    {pagina.content?.map(objeto => (
                        <tr key={objeto.id}>
                            <td>{formatLocalDate(objeto.date, 'dd/MM/yyyy')}</td>
                            <td>{objeto.seller.name}</td>
                            <td>{objeto.visitedClients}</td>
                            <td>{objeto.closedDeals}</td>
                            <td>R$ {objeto.quantity.toFixed(2)}</td>
                        </tr>
                    ))
                    }
                </tbody>
            </table>
        </div>

    );

}

export default SalesTable