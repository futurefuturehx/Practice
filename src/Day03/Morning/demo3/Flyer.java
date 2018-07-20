package Day03.Morning.demo3;
//为啥使用接口 不用抽象类 因为抽象类有继承关系 而钢铁侠和飞机没有继承关系 只是都能飞
public interface Flyer {
    int MAX_AGE=100;
    public abstract void fly();
}
