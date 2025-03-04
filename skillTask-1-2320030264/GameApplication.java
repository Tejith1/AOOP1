// Singleton for Game Settings
class GameSettings {
    private static GameSettings instance;
    private String difficulty;
    
    private GameSettings() {
        this.difficulty = "Medium";
    }
    
    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }
    
    public String getDifficulty() {
        return difficulty;
    }
    
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}

// Factory Pattern for Game Levels
interface GameLevel {
    void startLevel();
}

class EasyLevel implements GameLevel {
    public void startLevel() {
        System.out.println("Starting Easy Level");
    }
}

class HardLevel implements GameLevel {
    public void startLevel() {
        System.out.println("Starting Hard Level");
    }
}

class GameLevelFactory {
    public static GameLevel getGameLevel(String difficulty) {
        switch (difficulty) {
            case "Easy": return new EasyLevel();
            case "Hard": return new HardLevel();
            default: throw new IllegalArgumentException("Invalid difficulty");
        }
    }
}

// Abstract Factory for Game Objects
interface Enemy {
    void attack();
}

class EasyEnemy implements Enemy {
    public void attack() {
        System.out.println("Easy Enemy attacks slowly!");
    }
}

class HardEnemy implements Enemy {
    public void attack() {
        System.out.println("Hard Enemy attacks aggressively!");
    }
}

interface GameObjectFactory {
    Enemy createEnemy();
}

class EasyGameObjectFactory implements GameObjectFactory {
    public Enemy createEnemy() {
        return new EasyEnemy();
    }
}

class HardGameObjectFactory implements GameObjectFactory {
    public Enemy createEnemy() {
        return new HardEnemy();
    }
}

public class GameApplication {
    public static void main(String[] args) {
        GameSettings settings = GameSettings.getInstance();
        settings.setDifficulty("Hard");
        
        GameLevel level = GameLevelFactory.getGameLevel(settings.getDifficulty());
        level.startLevel();
        
        GameObjectFactory factory = new HardGameObjectFactory();
        Enemy enemy = factory.createEnemy();
        enemy.attack();
    }
}
