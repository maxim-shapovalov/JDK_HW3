/*Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
 а также переопределение метода toString(), возвращающее строковое представление пары. Работу сдать в виде
  ссылки на гит репозиторий.
 */

public record Pair1<F,S>(F first,S second){
    public Pair1(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public F first() {
        return first;
    }

    @Override
    public S second() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair1{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
        }
