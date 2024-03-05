import java.util.ArrayList;

public class MagazineLibrary {
        private ArrayList<Magazine> magazines;

        public MagazineLibrary(){
            this.magazines = new ArrayList<>();
        }

        public Magazine getMagazine(int index)
        {
            Magazine newCopy = new Magazine(this.magazines.get(index));
            return newCopy;
        }

        public void setMagazine(Magazine newMagazine, int index){
            this.magazines.set(index, new Magazine(newMagazine));
        }

        public void addMagazine(Magazine newMagazine){
            Magazine newCopy = new Magazine(newMagazine);
            this.magazines.add(newCopy);
        }
        
}
