public class Fenster
{
    private String  material;       // Alu Holz Kunststoff
    private int     preis;          // Der Preis des Fensters inkl. Steuer in Euro
    private boolean kippbar;        // Kann das Fenster gekippt werden
    
    public Fenster(String neuMaterial, int neuPreis, boolean neuKippbar)
    {
        setMaterial(neuMaterial);
        setPreis(neuPreis);
        setKippbar(neuKippbar);
    }
    
    public Fenster(int neuPreis)
    {
        setMaterial("Alu");
        setPreis(neuPreis);
        setKippbar(true);
    }
    
    public Fenster(String neuMaterial, int neuPreis)
    {
        setMaterial(neuMaterial);
        setPreis(neuPreis);
        setKippbar(true);  
    }
    
    public Fenster()
    {
        setMaterial("Alu");
        setPreis(499);
        setKippbar(true);
    }
    
    public String getMaterial()
    {
        return material;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public boolean getKippbar()
    {
        return kippbar;
    }
    
    public void setMaterial(String neuMaterial)
    {
        // Die Eigenschaft material wird mit dem Wert des Parameters neuMaterial überschrieben
        material = neuMaterial;
    }
    
    public void setPreis(int neuPreis)
    {
        preis = neuPreis;
    }
    
    public void setKippbar(boolean neuKippbar)
    {
        kippbar = neuKippbar;
    }
    
    /*
    material Fenster: preis EUR - kippbar
    Alu Fenster: 399 EUR - true
    Holz Fenster: 459 EUR - false
    */
    public void printFenster()
    {
        System.out.println(material + " Fenster: " + preis + " EUR - " + kippbar);
    }
}



















