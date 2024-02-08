package rinhabackend2024;

import static spark.Spark.get;

public class Hello {

    public static void main(String[] args) {
        get("/", (req, res) -> {
            return "teste do willis";
        });
    }

}