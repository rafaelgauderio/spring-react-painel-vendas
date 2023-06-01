const SalesTable = () => {

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
                    <tr>
                        <td>17/12/2022</td>
                        <td>Larissa de Luca</td>
                        <td>22</td>
                        <td>37</td>
                        <td>22570.00</td>
                    </tr>
                    <tr>
                        <td>17/12/2022</td>
                        <td>Larissa de Luca</td>
                        <td>22</td>
                        <td>37</td>
                        <td>22570.00</td>
                    </tr>
                    <tr>
                        <td>17/12/2022</td>
                        <td>Larissa de Luca</td>
                        <td>22</td>
                        <td>37</td>
                        <td>22570.00</td>
                    </tr>
                </tbody>
            </table>
        </div>

    );

}

export default SalesTable