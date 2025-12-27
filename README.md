# Common Utility Library (`common-utiility`)

A reusable **Java utility library** for Spring Boot projects, providing common utilities like `DateTimeUtility`, `IdGeneratorUtility`, and other helper classes.

This library is designed to be **shared across multiple microservices or projects** without rewriting the same utilities again and again.

---

## **Features**

* `DateTimeUtility` – easy formatting of `Date` objects.
* `IdGeneratorUtility` – generate unique IDs for entities.
* Other reusable helper methods for common tasks.

---

## **Getting Started**

These instructions will help you include the library in your project.

### **1️⃣ Clone the repository**

```bash
git clone https://github.com/your-username/common-utiility.git
cd common-utiility
```

---

### **2️⃣ Build and publish locally**

Publish the library to your **local Maven repository** (`~/.m2/repository`) so other projects can use it:

```bash
# Clean previous build
./gradlew clean

# Build the library
./gradlew build

# Publish to local Maven repository
./gradlew publishToMavenLocal
```

After publishing, the library JAR will be available at:

```
~/.m2/repository/rnd/dev/common-utiility/0.0.1-SNAPSHOT/
```

---

### **3️⃣ Use in another project**

In your other Gradle project, add `mavenLocal()` to the repositories and include the dependency:

```gradle
repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation 'rnd.dev:common-utiility:0.0.1-SNAPSHOT'
}
```

### **4️⃣ Updating the library**

When you make changes to the library:

```bash
./gradlew clean publishToMavenLocal
```

Then your other projects can **refresh Gradle** to get the updated version:

```bash
./gradlew build --refresh-dependencies
```

---

