Notes to Caching
===

Spring uses 5 Annotations

 * **@Cacheable** - Writes Cache Entries
 * **@CacheEvict** - Deletes Cache Entries
 * **@CachePut** - Writes Cache Entries, but executes the Method
 * **@Caching** - Wrapper for multiple @CacheEvict or @CachePut Annotations
 * **@CacheConfig** - Configure Cache

Uses **JSR-107** JCache Java temporary caching API (https://www.jcp.org/en/jsr/detail?id=107)

Example will write Redis Entry (given http://localhost:8080/1/2 is called):

    Key: cacheOfBigCalculation::1.0,2.0
    Value: \xac\xed\x00\x05sr\x00\x10java.lang.Double\x80\xb3\xc2J)k\xfb\x04\x02\x00\x01D\x00\x05valuexr\x00\x10java.lang.Number\x86\xac\x95\x1d\x0b\x94\xe0\x8b\x02\x00\x00xp@\x00\x00\x00\x00\x00\x00\x00