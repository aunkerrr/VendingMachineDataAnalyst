package Report;

import exceptionsHandler.InvalidSaleException;

import java.util.ArrayList;
import java.util.List;
public class GenerateReports {
    public void generateReport(List<InvalidSaleException.Sale> sales) {
        System.out.println("Generating reports for " + sales.size() + " sales.");
    }

    public List<String> getRawData() {
        List<String> righe = List.of(
                "2025-12-18 08:01;A1;Patatine;1.70;CARD",
                "2025-12-18 08:03;A2;Cracker;1.10;CASH",
                "2025-12-18 08:05;B1;Acqua;0.50;CARD",
                "2025-12-18 08:07;B2;Acqua;0.50;CARD",
                "2025-12-18 08:10;C1;Cioccolato;1.20;CARD",
                "2025-12-18 08:12;C2;Merendina;1.30;CASH",
                "2025-12-18 08:15;D1;Cracker;1.10;CARD",
                "2025-12-18 08:18;A1;Patatine;1.70;CASH",
                "2025-12-18 08:20;A3;Barretta;1.50;CARD",
                "2025-12-18 08:22;B3;Succo;1.00;CARD",

                "2025-12-18 08:25;C3;Cioccolato;1.20;CARD",
                "2025-12-18 08:27;D2;Cracker;1.10;CASH",
                "2025-12-18 08:30;A2;Cracker;1.10;CARD",
                "2025-12-18 08:32;B1;Acqua;0.50;CARD",
                "2025-12-18 08:35;C1;Cioccolato;1.20;CARD",
                "2025-12-18 08:37;A1;Patatine;1.70;CARD",
                "2025-12-18 08:40;B4;Succo;1.00;CASH",
                "2025-12-18 08:42;D3;Barretta;1.50;CARD",
                "2025-12-18 08:45;A4;Gallette;1.40;CARD",
                "2025-12-18 08:48;B2;Acqua;0.50;CARD",

                "2025-12-18 09:00;A1;Patatine;1.70;CARD",
                "2025-12-18 09:02;A1;Patatine;1.70;BANCOMAT",   // pagamento non valido
                "2025-12-18 09:05;B1;Acqua;0.50;CARD",
                "2025-12-18 09:07;C2;Merendina;1.30;CARD",
                "2025-12-18 09:10;D1;Cracker;1.10;CASH",
                "2025-12-18 09:12;Z9;Gomma;0.90;CARD",             // slot non valido
                "2025-12-18 09:15;A3;Barretta;-1.50;CARD",           // prezzo negativo
                "2025-12-18 09:18;B2;;0.50;CARD",                         // prodotto mancante
                "2025-12-18 09:20;C3;Cioccolato;1.20;CARD",
                "2025-12-18 09:22;D2;Cracker;1.10;CASH",

                "2025-12-18 09:25;A2;Cracker;1.10;CARD",
                "2025-12-18 09:27;B3;Succo;1.00;CARD",
                "2025-12-18 09:30;C1;Cioccolato;1.20;CARD",
                "2025-12-18 09:32;A4;Gallette;1.40;CARD",
                "2025-12-18 09:35;D3;Barretta;1.50;CASH",
                "2025-12-18 09:38;B1;Acqua;0.50;CARD",
                "2025-12-18 09:40;C2;Merendina;1.30;CARD",
                "2025-12-18 09:42;A1;Patatine;1.70;CARD",
                "2025-12-18 09:45;B4;Succo;1.00;CARD",

                "2025-12-18 10:00;A1;Patatine;1.70;CARD",
                "2025-12-18 10:05;A2;Cracker;1.10;CASH",
                "2025-12-18 10:10;B1;Acqua;0.50;CARD",
                "2025-12-18 10:15;C3;Cioccolato;1.20;CARD",
                "2025/12/18 10:20;D1;Cracker;1.10;CARD"            // timestamp errato
        );
        return new ArrayList<>();
    }
}
