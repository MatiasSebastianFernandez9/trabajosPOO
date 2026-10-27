package ar.edu.unlu.poo.lujan.clase05.billetera;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Billetera {
    private final List<Cuenta> cuentas = new ArrayList<>();;

    public void abrirCuenta(String unaDivisa){
        cuentas.add(new Cuenta(unaDivisa));
    }

    public double getSaldo(String unaDivisa){
        for (Cuenta c: cuentas){
            if(c.getDivisa().equals(unaDivisa)){
              return c.getSaldo();
            }
        }

        return 0.0;
    }

    public void depositar(String unaDivisa, int unMonto) {
        /*for (Cuenta c: cuentas){
            if(c.getDivisa().equals(unaDivisa)){
                c.depositar(unMonto);
                break;
            }
        }*/

        Optional<Cuenta> oc = buscarCuenta(unaDivisa);
        oc.ifPresent(cuenta -> cuenta.depositar(unMonto));
    }

    public void extraer(String unaDivisa, int unMonto) {
        /*for (Cuenta c: cuentas){
            if(c.getDivisa().equals(unaDivisa)){
                c.extraer(unMonto);
                break;
            }
        }*/
        Optional<Cuenta> oc = buscarCuenta(unaDivisa);
        oc.ifPresent(cuenta -> cuenta.extraer(unMonto));

    }

    private Optional<Cuenta> buscarCuenta(String unaDivisa){
        /*for (Cuenta c: cuentas){
            if(c.getDivisa().equals(unaDivisa)){
                return c;
            }
        }
        return null;*/
        return cuentas.stream().filter( cuenta -> cuenta.getDivisa().equalsIgnoreCase(unaDivisa)).findFirst();

    }
}
