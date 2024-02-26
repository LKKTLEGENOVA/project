// Интерфейс для создания одежды
interface ClothesFactory {
    Clothes createClothes(String type);
}

// Конкретная фабрика для создания мужской одежды
class MensClothesFactory implements ClothesFactory {

    @Override
    public Clothes createClothes(String type) {
        if (type.equals("Shirt")) {
            return new MensShirt();
        } else if (type.equals("Pants")) {
            return new MensPants();
        } else {
            return null;
        }
    }
}

// Конкретная фабрика для создания женской одежды
class WomensClothesFactory implements ClothesFactory {

    @Override
    public Clothes createClothes(String type) {
        if (type.equals("Shirt")) {
            return new WomensShirt();
        } else if (type.equals("Pants")) {
            return new WomensPants();
        } else {
            return null;
        }
    }
}

// Интерфейс для одежды
interface Clothes {
    void wear();
}

// Класс "Мужская рубашка"
class MensShirt implements Clothes {

    @Override
    public void wear() {
        System.out.println("Wearing a men's shirt");
    }
}

// Класс "Мужские штаны"
class MensPants implements Clothes {

    @Override
    public void wear() {
        System.out.println("Wearing men's pants");
    }
}

// Класс "Женская рубашка"
class WomensShirt implements Clothes {

    @Override
    public void wear() {
        System.out.println("Wearing a women's shirt");
    }
}

// Класс "Женские штаны"
class WomensPants implements Clothes {

    @Override
    public void wear() {
        System.out.println("Wearing women's pants");
    }
}

// Пример использования фабрики
public class Main {

    public static void main(String[] args) {
        ClothesFactory factory = new MensClothesFactory();

        Clothes shirt = factory.createClothes("Shirt");
        Clothes pants = factory.createClothes("Pants");

        shirt.wear();
        pants.wear();

        // ...

        factory = new WomensClothesFactory();

        shirt = factory.createClothes("Shirt");
        pants = factory.createClothes("Pants");

        shirt.wear();
        pants.wear();
    }
}
