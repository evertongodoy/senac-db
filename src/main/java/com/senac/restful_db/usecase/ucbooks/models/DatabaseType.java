package com.senac.restful_db.usecase.ucbooks.models;

public enum DatabaseType {
    MYSQL("MYSQL"),
    MONGODB("MONGODB");

    private String displayName;

    DatabaseType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static DatabaseType fromString(String text) {
        for (DatabaseType type : DatabaseType.values()) {
            if (type.displayName.equalsIgnoreCase(text)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }


}
