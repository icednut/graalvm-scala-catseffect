## GraalVM with Scala 2, Cats Effect 3

### Build
```
sbt clean nativeImage
```

### Run
```
./target/native-image/graalvm-scala-catseffect
```

### Benchmark
```
hyperfine ./target/native-image/graalvm-scala-catseffect
```
