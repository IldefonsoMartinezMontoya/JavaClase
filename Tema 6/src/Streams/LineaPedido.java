package Streams;

import java.util.ArrayList;
import java.util.List;

public class LineaPedido {
    private int tipoIVA;
    private double precioUnidad;
    private int unidades;
    private String concepto;

    public LineaPedido(String concepto, double precioUnidad, int unidades, int tipoIVA) {
        setConcepto(concepto);
        setPrecioUnidad(precioUnidad);
        setUnidades(unidades);
        setTipoIVA(tipoIVA);
    }

    static void main() {
        List<LineaPedido> lineasPedido = new ArrayList<>();
        lineasPedido.add(new LineaPedido("Ratón inalámbrico", 29.99, 1, 21));
        lineasPedido.add(new LineaPedido("Arroz bomba 1kg", 2.50, 4, 10));
        lineasPedido.add(new LineaPedido("Zumo de naranja 1L", 1.75, 3, 10));
        lineasPedido.add(new LineaPedido("Pan integral", 1.80, 3, 4));
        lineasPedido.add(new LineaPedido("Libro bestseller", 15.50, 2, 21));
        lineasPedido.add(new LineaPedido("Camiseta algodón", 19.95, 3, 21));
        lineasPedido.add(new LineaPedido("Leche entera", 0.95, 6, 4));
        lineasPedido.add(new LineaPedido("Huevos docena", 2.20, 2, 4));
        lineasPedido.add(new LineaPedido("Cafetera eléctrica", 49.90, 1, 21));
        lineasPedido.add(new LineaPedido("Entrada cine", 5.90, 2, 10));
        System.out.println("Líneas de pedido generadas:");
        lineasPedido.forEach(lp -> System.out.printf(
                "- %-20s %2d uds x %5.2f€ (IVA %2d%%) %n",
                lp.getConcepto(), lp.getUnidades(), lp.getPrecioUnidad(), lp.getTipoIVA()
        ));
        totalBrutoPedido(lineasPedido);
        totalNetoMinUnidades(lineasPedido, 1);
    }
    public static void totalBrutoPedido(List<LineaPedido> l) {
        System.out.println(STR."Total Bruto de los Pedidos: \{l.stream().mapToInt(LineaPedido -> (int) LineaPedido.precioUnidad).sum()}€");
    }
    public static void totalNetoMinUnidades(List<LineaPedido> l, int minUnidades) {
        System.out.println(STR."Total neto de pedidos con más de \{minUnidades} unidades: \{l.stream().filter(LineaPedido -> LineaPedido.unidades > minUnidades).mapToInt(LineaPedido -> (int) (LineaPedido.precioUnidad * LineaPedido.tipoIVA)).sum()}€");
    }
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        if (concepto.isBlank()) {
            throw new IllegalArgumentException("No puede estar vacío");
        } else {
            this.concepto = concepto;
        }
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        if (precioUnidad < 0) {
            throw new IllegalArgumentException("No puede ser menor que 0");
        } else {
            this.precioUnidad = precioUnidad;
        }
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        if (unidades < 0) {
            throw new IllegalArgumentException("No puede ser menor de 0");
        } else {
            this.unidades = unidades;
        }
    }

    public int getTipoIVA() {
        return tipoIVA;
    }

    public void setTipoIVA(int tipoIVA) {
        if (tipoIVA < 0) {
            throw new IllegalArgumentException("No puede ser negativo");
        } else {
            this.tipoIVA = tipoIVA;
        }
    }
}
