plugins {
    kotlin("multiplatform") version "1.4.0"
}

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

kotlin {
  mingwX64("native") {
    binaries {
      executable()
    }
  }
}

tasks.withType<Wrapper> {
  gradleVersion = "6.6.1"
  distributionType = Wrapper.DistributionType.ALL
}


