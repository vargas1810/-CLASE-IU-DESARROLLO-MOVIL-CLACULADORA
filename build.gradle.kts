

buildscript {
    extra.apply {
        set("compose_compiler_version", "1.5.3")
    }

}

plugins {
    id("com.android.application") version "8.1.2" apply false
    id("com.android.library") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}
