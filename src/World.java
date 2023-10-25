public class World
{
    final int quantidade_de_niveis = 5;//Como não sabia a quantidade de níveis, adicionei
                                      //essa constante apenas para inicializar a variável levels;

    private Level levels[] = new Level[quantidade_de_niveis];
    private Level selectedLevel;

    public Level[] getLevels()
    {
        return this.levels;
    }
    public void setLevels(Level[] levels)
    {
        this.levels = levels;
    }
    public Level getSelectedLevel()
    {
        return this.selectedLevel;
    }
    public void setSelectedLevel(Level selectedlevel)
    {
        this.selectedLevel = selectedlevel;
    }
    public World(){}
    public void loadLevel()
    {

    }
}
