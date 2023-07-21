public class Jsonify {
    public static String createJson(String[] args) {
        // Verificar si hay al menos un argumento en la entrada
        if (args.length > 0) {
            // Construir el JSON manualmente
            StringBuilder jsonBuilder = new StringBuilder();
            jsonBuilder.append("{\"data\":[");
            for (int i = 0; i < args.length; i++) {
                jsonBuilder.append("\"").append(args[i]).append("\"");
                if (i < args.length - 1) {
                    jsonBuilder.append(",");
                }
            }
            jsonBuilder.append("]}");

            // Retornar el JSON resultante
            return jsonBuilder.toString();
        } else {
            return "{\"data\":[]}";
        }
    }
}
