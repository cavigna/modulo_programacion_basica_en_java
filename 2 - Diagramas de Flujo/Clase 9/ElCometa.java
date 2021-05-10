package com.nacho.ejericios;
/* Fábricas “El cometa” produce artículos con claves (1, 2, 3, 4, 5 y 6). Se requiere un
algoritmo para calcular los precios de venta, para esto hay que considerar lo siguiente:

Costo de producción = materia prima + mano de obra + gastos de fabricación.

Precio de venta = costo de producción + 45 % de costo de producción.
El costo de la mano de obra se obtiene de la siguiente forma: para los productos con clave 3 o 4 se carga 75 % del
costo de la materia prima; para los que tienen clave 1 y 5 se carga 80 %, y para los que
tienen clave 2 o 6, 85 %.
Para calcular el gasto de fabricación se considera que si el artículo que se va a producir
tiene claves 2 o 5, este gasto representa 30 % sobre el costo de la materia prima; si las
claves son 3 o 6, representa 35 %; si las claves son 1 o 4, representa 28 %. La materia
prima tiene el mismo costo para cualquier clave. Realizar el Pseudocodigo y diagrama de
flujo. */

public class ElCometa {
    public static double precioVenta(int clave, double materiaPrima){
        double costoProducion =0;
        double manoObra =0;
        double gsFabri = 0;
//Costo de producción = materia prima + mano de obra + gastos de fabricación.
        if (clave==5 || clave==1) manoObra = materiaPrima * .80;
        else if (clave== 3 || clave == 4) manoObra =materiaPrima * .75;
        else manoObra = materiaPrima * .85;

        if (clave==5 || clave==2) gsFabri = materiaPrima * 0.30;
        else if (clave==6 || clave==3) gsFabri = materiaPrima * 0.35;
        else gsFabri =materiaPrima *.28;

        costoProducion = materiaPrima + manoObra + gsFabri;

        return costoProducion*1.45;
    }
}
