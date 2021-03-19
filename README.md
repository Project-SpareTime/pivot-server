# `Project-SpareTime/pivot-server`

![Heroku](http://heroku-badge.herokuapp.com/?app=pst-pivot-server)

## Getting Started with `pivot-server`

### Prerequisites for running `pivot-server`

- `java` (version>=1.8.0_281)
- `mvn` (version >= 3.6.3)
- `git` 

### Running it locally

Clone this repository with `git`.

```powershell
git clone https://github.com/Project-SpareTime/pivot-server
```

 Once the repository is clone, change you current-working directory to `pivot-server`.

```powershell
cd pivot-server
```

 Now, run the following commands to install maven dependencies.

```powershell
mvn clean install
```

To run the server, just type `mvn spring-boot:run`.

### Pushing changes to the repository

The `Project-SpareTime/pivot-server` repository is hooked to Heroku service with auto deploys enabled.

So on every successful commit merge, the changes get deployed via the Heroku CI/CD. 

