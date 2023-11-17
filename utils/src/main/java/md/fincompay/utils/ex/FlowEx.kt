package md.fincompay.utils.ex

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import md.fincompay.utils.State

inline fun <T, reified R> Flow<State<T>>.mapState(
        crossinline transform: suspend (value: T?) -> R
): Flow<State<R>> {
    return map { it.mapAsync(transform) }
}