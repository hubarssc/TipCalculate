package homework10;

import java.util.Optional;

public class NullOptional {

        public static void main(String[] args) {
            // Создаем объекты компьютера, звуковой карты и USB-устройства
            USB usb = new USB("USB 3.0");
            Soundcard soundcard = new Soundcard(usb);
            Computer computer = new Computer(soundcard);

            // Получаем версию USB-устройства с использованием цепочки Optional и функциональных методов
            String version = Optional.of(computer)
                    .flatMap(Computer::getSoundcard)
                    .flatMap(Soundcard::getUSB)
                    .map(USB::getVersion)
                    .orElse("UNKNOWN");

            // Выводим версию USB-устройства
            System.out.println("Версия USB-устройства: " + version);
        }
    }

    // Класс Computer
    class Computer {
        private final Optional<Soundcard> soundcard;

        public Computer(Soundcard soundcard) {
            this.soundcard = Optional.ofNullable(soundcard);
        }

        public Optional<Soundcard> getSoundcard() {
            return soundcard;
        }
    }

    // Класс Soundcard
    class Soundcard {
        private final Optional<USB> usb;

        public Soundcard(USB usb) {
            this.usb = Optional.ofNullable(usb);
        }

        public Optional<USB> getUSB() {
            return usb;
        }
    }

    // Класс USB
    class USB {
        private final String version;

        public USB(String version) {
            this.version = version;
        }

        public String getVersion() {
            return version;
        }
    }

