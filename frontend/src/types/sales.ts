import { Seller } from "./seller";

export type SaleSum = {
    sellerName: string,
    sumSales: number,
};

export type ClosedDealsSuccessFee = {
    sellerName: string,
    sumVisitedClients: number,
    sumClosedDeals: number,
};

export type Sale = {
    id: number,
    visitedClients: number,
    closedDeals: number,
    quantity: number,
    date: string,
    seller: Seller,
}

export type SalePaged = {
    content: Sale[];
    totalElements: number,
    totalPages: number,
    last: boolean,
    size: number,
    number: number,
    sort?: {
        sorted: boolean,
        unsorted: boolean,
        empty: boolean
    },
    numberOfElements: number,
    first: boolean,
    empty: boolean
}