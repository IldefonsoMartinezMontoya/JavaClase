public class Ejercicio_1 {
    private String nombre;
    private int dianacimiento;
    private int mesnacimiento;
    private int anionacimiento;

    public Ejercicio_1(String n, int dia, int mes, int anio) {
        setNombre(n);
        setMesnacimiento(mes);
        setDianacimiento(dia);
        setAnionacimiento(anio);
    }

    @Override
    public String toString() {
        return nombre +
                " " + dianacimiento +
                "/" + mesnacimiento +
                "/" + anionacimiento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isBlank()) {
            throw new IllegalArgumentException("No puede estar en blanco");
        } else {
            this.nombre = nombre;
        }
    }

    public int getDianacimiento() {
        return dianacimiento;
    }

    public void setDianacimiento(int dianacimiento) {
        switch (mesnacimiento) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dianacimiento >= 1 && dianacimiento <= 31) {
                    this.dianacimiento = dianacimiento;
                } else {
                    throw new IllegalArgumentException("Día no válido");
                }
                break;
            case 2:
                    if (dianacimiento >= 1 && dianacimiento <= 28) {
                        this.dianacimiento = dianacimiento;
                    } else {
                        throw new IllegalArgumentException("Día no válido");
                    }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dianacimiento >= 1 && dianacimiento <= 30) {
                    this.dianacimiento = dianacimiento;
                } else {
                    throw new IllegalArgumentException("Día no válido");
                }
                break;
            default:
        }
    }

    public int getMesnacimiento() {
        return mesnacimiento;
    }

    public void setMesnacimiento(int mesnacimiento) {
        if (mesnacimiento < 1 || mesnacimiento > 12) {
            throw new IllegalArgumentException("Mes no válido");
        } else {
            this.mesnacimiento = mesnacimiento;
        }
        if (dianacimiento != 0) {
            setDianacimiento(dianacimiento);
        }
    }

    public int getAnionacimiento() {
        return anionacimiento;
    }

    public void setAnionacimiento(int anionacimiento) {
        if (anionacimiento <= 0) {
            throw new IllegalArgumentException("Año no válido");
        } else {
            this.anionacimiento = anionacimiento;
        }

    }
}
