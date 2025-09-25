public class Fenster
{
    private String  material;       // Alu Holz Kunststoff
    private int     preis;          // Der Preis des Fensters inkl. Steuer in Euro
    private boolean kippbar;        // Kann das Fenster gekippt werden
    
    public Fenster(String material, int preis, boolean kippbar)
    {
        setMaterial(material);
        setPreis(preis);
        setKippbar(kippbar);
    }
    
    public Fenster(int preis)
    {
        setMaterial("Alu");
        setPreis(preis);
        setKippbar(true);
    }
    
    public Fenster(String material, int preis)
    {
        setMaterial(material);
        setPreis(preis);
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
    
    public void setMaterial(String material)
    {
        // Die Eigenschaft material wird mit dem Wert des Parameters neuMaterial überschrieben
        this.material = material;
    }
    
    public void setPreis(int preis)
    {
        this.preis = preis;
    }
    
    public void setKippbar(boolean kippbar)
    {
        this.kippbar = kippbar;
    }
    
    public void testen()
    {
        //System.out.println(material.charAt(0));
        //System.out.println(material.charAt(2));
        System.out.println(material.indexOf(" "));
    }
    
    //             012345
    // material = "Alu 35"
    public String getRohstoff()
    {
        int pos;
        
        pos = material.indexOf(" ");        // 3
        return material.substring(0, pos);  // 0 .. 3 => "Alu"
    }
    
    /*
    material Fenster: preis EUR - kippbar
    Alu Fenster: 399 EUR - KIPPBAR
    Holz Fenster: 459 EUR - nicht KIPPBAR
    */
    public void printFenster()
    {
        if (kippbar == true)
        {
            System.out.println(material + " Fenster: " + preis + " EUR - " + "KIPPBAR");
        }
        else
        { 
            System.out.println(material + " Fenster: " + preis + " EUR - " + "nicht KIPPBAR");
        }
    }
}



















