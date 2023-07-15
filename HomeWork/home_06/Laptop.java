package HomeWork.home_06;
// import HomeWork.home_06.CPU;
// import HomeWork.home_06.GPU;

public class Laptop {
    String company;
    String model;
    String OS;
    String color;
    int volumeRAM;
    int volumeHDD;
    CPU cpu = new CPU();
    GPU gpu = new GPU();
    
    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, RAM: %dGb, HDD: %dGb, %s, %s\n", company, model, OS, color, volumeRAM, volumeHDD, cpu, gpu);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((company == null) ? 0 : company.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((OS == null) ? 0 : OS.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + volumeRAM;
        result = prime * result + volumeHDD;
        result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
        result = prime * result + ((gpu == null) ? 0 : gpu.hashCode());
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
        Laptop other = (Laptop) obj;
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
        if (OS == null) {
            if (other.OS != null)
                return false;
        } else if (!OS.equals(other.OS))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (volumeRAM != other.volumeRAM)
            return false;
        if (volumeHDD != other.volumeHDD)
            return false;
        if (cpu == null) {
            if (other.cpu != null)
                return false;
        } else if (!cpu.equals(other.cpu))
            return false;
        if (gpu == null) {
            if (other.gpu != null)
                return false;
        } else if (!gpu.equals(other.gpu))
            return false;
        return true;
    }
    
}
