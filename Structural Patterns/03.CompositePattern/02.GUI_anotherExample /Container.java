package CompositePattern.gui;

import java.util.ArrayList;
import java.util.List;

public class Container implements IComponent {

   private List<IComponent> children = new ArrayList<>();
    
   public void Add(IComponent component){
       children.add(component);
   }
    
   public void Delete(IComponent component){
      children.remove(component);
   }
    
    @Override
    public void Draw() {
     System.out.println("Drawing Container background and border");
     
        for (IComponent child : children) {
            child.Draw();
        }
    }
    
}
