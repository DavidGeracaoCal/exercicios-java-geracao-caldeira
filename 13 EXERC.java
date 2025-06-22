LocalTime envio = LocalTime.of(23, 0);       // 23:00
LocalTime limite = LocalTime.of(22, 59);     // 22:59

if (!envio.isBefore(limite)) {
    System.out.println("Entrega fora do horário."); 
} else {
    System.out.println("Tarefa enviada com sucesso.");
}
