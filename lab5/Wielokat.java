class Wielokat extends Figura{
    int lW, lB;
    double sumaK;

    public int getlW() {
        return lW;
    }

    public void setlW(int lW) {
        this.lW = lW;
    }

    public int getlB() {
        return lB;
    }

    public void setlB(int lB) {
        this.lB = lB;
    }

    public double getSumaK() {
        return sumaK;
    }

    public void setSumaK(double sumaK) {
        this.sumaK = sumaK;
    }

    @Override
    public void rysuj() {
        super.rysuj();
    }

    double sumaKantow()
    {
        return (lB-2)*180;
    }
    Wielokat(){}
}
