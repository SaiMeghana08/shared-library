package org.example

class Helper implements Serializable {

    def steps

    Helper(steps) {
        this.steps = steps
    }

    def printMessage() {
        steps.echo "Hello from Helper class"
    }
}
