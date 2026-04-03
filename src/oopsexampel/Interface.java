package oopsexampel;

public class Interface {
    interface Camera {
        void takePhoto();
    }

    interface MusicPlayer {
        void playMusic();
    }

    static class SmartPhone implements Camera, MusicPlayer {
        public void takePhoto() {
            System.out.println("Photo taken");
        }

        public void playMusic() {
            System.out.println("Music playing");
        }
    }
        public static void main(String[] args) {
            SmartPhone sp = new SmartPhone();
            sp.takePhoto();
            sp.playMusic();
        }
    }

