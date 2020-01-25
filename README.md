Notes to Caching
===

Spring uses 5 Annotations

 * **@Cacheable** - Writes Cache Entries
 * **@CacheEvict** - Deletes Cache Entries
 * **@CachePut** - Writes Cache Entries, but executes the Method
 * **@Caching** - Wrapper for multiple @CacheEvict or @CachePut Annotations
 * **@CacheConfig** - Configure Cache

Uses **JSR-107** JCache Java temporary caching API (https://www.jcp.org/en/jsr/detail?id=107)