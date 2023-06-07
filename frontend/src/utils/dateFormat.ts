import { format } from "date-fns";

export const formatLocalDate = (date: string, desingPattern: string) => {
    const newDate = new Date(date);
    const newDateOnly =  new Date(newDate.valueOf() + newDate.getTimezoneOffset() * 60 * 1000);
    return format(newDateOnly, desingPattern);
};