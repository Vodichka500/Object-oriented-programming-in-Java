class Elips extends Figura{
    double pW;
    double pM;
    double F1x,F1y,F2x,F2y;

    public double getpW() {
        return pW;
    }

    public void setpW(double pW) {
        this.pW = pW;
    }

    public double getpM() {
        return pM;
    }

    public void setpM(double pM) {
        this.pM = pM;
    }

    public double getF1x() {
        return F1x;
    }

    public void setF1x(double f1x) {
        F1x = f1x;
    }

    public double getF1y() {
        return F1y;
    }

    public void setF1y(double f1y) {
        F1y = f1y;
    }

    public double getF2x() {
        return F2x;
    }

    public void setF2x(double f2x) {
        F2x = f2x;
    }

    public double getF2y() {
        return F2y;
    }

    public void setF2y(double f2y) {
        F2y = f2y;
    }

    @Override
    public void rysuj() {
        super.rysuj();
    }

    Elips(){}

    double odleglocs()
    {
        double c = Math.sqrt(Math.pow(F1x, 2) - Math.pow(F2x, 2));
        return c;
    }
}
