<template>
    <!--<li class="el-menu-item is-active" style="">{{msg}}</li>-->
    <div class="dashboard-editor-container">
        <el-row class="btn-group">
            <el-col :span="4" class='text-center'>
                <!--<router-link class="pan-btn blue-btn" to="/components/index">Components</router-link>-->
                <div>test1</div>
            </el-col>
            <el-col :span="4" class='text-center'>
                <!--<router-link class="pan-btn light-blue-btn" to="/charts/index">Charts</router-link>-->
                <div>test1</div>
            </el-col>
            <el-col :span="4" class='text-center'>
                <!--<router-link class="pan-btn pink-btn" to="/excel/download">Excel</router-link>-->
                <div>test1</div>
            </el-col>
            <el-col :span="4" class='text-center'>
                <!--<router-link class="pan-btn green-btn" to="/example/table/table">Table</router-link>-->
                <div>test1</div>
            </el-col>
            <el-col :span="4" class='text-center'>
                <!--<router-link class="pan-btn tiffany-btn" to="/example/form/edit">Form</router-link>-->
                <div>test1</div>
            </el-col>
            <el-col :span="4" class='text-center'>
                <!--<router-link class="pan-btn yellow-btn" to="/theme/index">Theme</router-link>-->
                <div>test1</div>
            </el-col>
        </el-row>
    </div>
</template>

<script>

    export default {
        name: 'db-sidebar',
        data() {
            return {
                msg: 'Dashboard'
            }
        }
    }

</script>

<style>
    li {
        padding-left: 20px;
    }
</style>
