package TypeAssign;

public class AssignTypePokemon {
    
    public static String assignType(String tipo){
        

        switch(tipo){
            case "fighting" -> {
                return "fighting";
            }
            case "psychic" -> {
                return "psychic";
            }
            case "poison" -> {
                return "poison";
            }
            case "dragon" -> {
                return "dragon";
            }
            case "ghost" -> {
                return "ghost";
            }
            case "dark" -> {
                return "dark";
            }
            case "ground" -> {
                return "ground";
            }
            case "fire" -> {
                return "fire";
            }
            case "fairy" -> {
                return "fairy";
            }
            case "water" -> {
                return "water";
            }
            case "flying" -> {
                return "flying";
            }
            case "normal" -> {
                return "normal";
            }
            case "rock" -> {
                return "rock";
            }
            case "electric" -> {
                return "electric";
            }
            case "bug" -> {
                return "bug";
            }
            case "grass" -> {
                return "grass";
            }
            case "ice" -> {
                return "ice";
            }
            case "steel" -> {
                return "steel";
            }
            case "" -> { 
                return "";
            }
            default -> System.out.println("Tipo de pokemon invalido");
        }
        return "None";
    }
}   
