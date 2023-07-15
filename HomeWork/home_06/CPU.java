package HomeWork.home_06;

public class CPU {
    String company;
    String model;
    int numberOfCores;
    double frequency;

    @Override
    public String toString() {
        return String.format("%s %s ядер: %d %.1fGH", company, model, numberOfCores, frequency);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((company == null) ? 0 : company.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + numberOfCores;
        long temp;
        temp = Double.doubleToLongBits(frequency);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CPU other = (CPU) obj;
        if (company == null) {
            if (other.company != null)
                return false;
        } else if (!company.equals(other.company))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (numberOfCores != other.numberOfCores)
            return false;
        if (Double.doubleToLongBits(frequency) != Double.doubleToLongBits(other.frequency))
            return false;
        return true;
    }
    
}
