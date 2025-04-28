-- 删除原普通索引
DROP INDEX CONCURRENTLY IF EXISTS i_g_k_v;

-- 创建唯一索引（推荐并发模式）
CREATE UNIQUE INDEX CONCURRENTLY i_g_k_v
    ON public.xxl_job_registry
    USING btree (registry_group, registry_key, registry_value);
