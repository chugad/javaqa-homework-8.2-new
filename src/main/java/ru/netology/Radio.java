package ru.netology;

public class Radio {

    // station

    private int currentStationNumber;
    private int minStationNumber;
    private int maxStationNumber;
    private int currentSoundVolume;
    private int minSoundVolume;
    private int maxSoundVolume;

//    station

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) { // будем считать что этим методом реализована функция нажатия кнопок на пульте от 0 до 9
        if (currentStationNumber > maxStationNumber) {
            return;
        }
        if (currentStationNumber < minStationNumber) {
            return;
        } else {
            this.currentStationNumber = currentStationNumber;

        }
    }


    public int getMinStationNumber() {
        return minStationNumber;
    }

    public void setMinStationNumber(int minStationNumber) {
        this.minStationNumber = minStationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

//     volume

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
            if (currentSoundVolume > maxSoundVolume) {
                return;
            }
            if (currentSoundVolume < minSoundVolume) {
                return;
            }
            this.currentSoundVolume = currentSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }
// методы для station

    public void next() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber;
        } else {
            currentStationNumber = currentStationNumber + 1;
        }
    }

    public void prev() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
    }

// методы для volume

        public void plus () {
            if (currentSoundVolume == 0) {
                currentSoundVolume = maxSoundVolume;
            }
            if (currentSoundVolume < maxSoundVolume) {
                currentSoundVolume = currentSoundVolume + 1;
            } else {
                currentSoundVolume = maxSoundVolume;
            }
        }
        public void minus () {
            if (currentSoundVolume > minSoundVolume) {
                currentSoundVolume = currentSoundVolume - 1;
            } else {
                currentSoundVolume = minSoundVolume;
            }
        }
    }
