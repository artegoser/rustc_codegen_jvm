package org.rustlang.runtime;

/** Runtime-private origin slot for generated Rust aggregate carriers. */
public interface MemoryViewOriginCarrier {
    Object $rcj$getMemoryViewOrigin();

    void $rcj$setMemoryViewOrigin(Object origin);
}
