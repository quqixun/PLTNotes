# Install BNFC

## 1. Simple Way

```
sudo apt-get install bnfc
```

## 2. Build from Source

### 2.1 Install Haskell Platform

```
sudo apt-get install haskell-platform
```

### 2.2 Clone and Build

```
git clone https://github.com/BNFC/bnfc.git
cd bnfc/source
cabal install
```

### 2.3 Add PATH

Add BNFC PATH to .bashrc, restart terminal.

```
export PATH="/home/yourname/.cabal/bin:$PATH"
```

## 3. Support Java Backend

```
sudo apt install jlex cup
```

Add CLASSPATH to .bashrc, restart terminal.

```
export CLASSPATH=.:/usr/share/java/JLex.jar:/usr/share/java/cup.jar
```

## 4. Test

```
bnfc --help
```
