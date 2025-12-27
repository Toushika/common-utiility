package rnd.dev.commonutiility.utility;

import java.util.UUID;

public class IdGeneratorUtility {

    private IdGeneratorUtility() {

    }

    public static String generateUniqueId() {
        return UUID.randomUUID().toString();
    }

}
