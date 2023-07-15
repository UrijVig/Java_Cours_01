package HomeWork.home_06;

public class GPU {
    String name;    
    int memory;    

    @Override
    public String toString() {
        return String.format("%s %dГб", name, memory);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());        
        result = prime * result + memory;
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
        GPU other = (GPU) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;        
        if (memory != other.memory)
            return false;
        return true;
    }    
}
