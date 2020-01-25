Notes to Caching
===

Spring uses 5 Annotations

 * **@Cacheable** - Writes Cache Entries
 * **@CacheEvict** - Deletes Cache Entries
 * **@CachePut** - Writes Cache Entries, but executes the Method
 * **@Caching** - Wrapper for multiple @CacheEvict or @CachePut Annotations
 * **@CacheConfig** - Configure Cache

Uses **JSR-107** JCache Java temporary caching API (https://www.jcp.org/en/jsr/detail?id=107)

    This will result in Redis Command: 
    
    1579970609.491101 [0 172.18.0.1:52834] "GET" "cacheOfBigCalculation::SimpleKey [1.0,3.5]"
    1579970609.496416 [0 172.18.0.1:52834] "SET" "cacheOfBigCalculation::SimpleKey [1.0,3.5]" "\xac\xed\x00\x05sr\x00\x10java.lang.Double\x80\xb3\xc2J)k\xfb\x04\x02\x00\x01D\x00\x05valuexr\x00\x10java.lang.Number\x86\xac\x95\x1d\x0b\x94\xe0\x8b\x02\x00\x00xp@\x0c\x00\x00\x00\x00\x00\x00"

    @Cacheable(cacheNames = "cacheOfBigCalculation")
    public double calculateSomethingBig(double numberOne, double numberTwo) { ... }
    