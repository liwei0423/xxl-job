-- 删除原普通索引
DROP INDEX CONCURRENTLY IF EXISTS i_g_k_v;

-- 创建唯一索引
CREATE UNIQUE INDEX CONCURRENTLY i_g_k_v
    ON public.xxl_job_registry
    USING btree (registry_group, registry_key, registry_value);

CREATE INDEX i_jobid_jobgroup ON public.xxl_job_log (job_id,job_group);

CREATE INDEX i_job_id ON public.xxl_job_log (job_id);

DROP INDEX CONCURRENTLY IF EXISTS i_trigger_day;

CREATE UNIQUE INDEX CONCURRENTLY i_trigger_day
    ON public.xxl_job_log_report
    USING btree (trigger_day);

